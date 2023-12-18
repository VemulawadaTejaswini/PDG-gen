import java.util.Scanner;
 
public class Main3{
 
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        
        int[][] card= new int[2][9];
        
        for(int k = 0; k < num; k++){
        	
            for(int j = 0; j < 2; j++){
                for(int i = 0; i < 9; i++){
 
                    if(j == 0){
                        card[j][i] = scan.nextInt();
                    }else{
 
                        String color =scan.next();
                        int intColor = 0;
                        if("R".equals(color)){
                            intColor = 11;
                        }else if("G".equals(color)){
                            intColor = 12;
                        }else {
                            intColor = 13;
                        }
                        card[j][i] = intColor;
                    }
                }
            }
 
            
            Card insCard = new Card();
            insCard.setCard(card);
 
            
            insCard.sort(card);
 
            card = insCard.getCard();
 
 
            
            int intCount = 0;
            intCount = insCard.win(card);
            
 
            if(3 <= intCount){
                System.out.println(1);
 
            }else{
                System.out.println(0);
            }
 
 
        }
 
 
 
    }
 
    static class Card {
    	
        private int[][] card = new int[2][9];
 
        
        Card(){
 
        }
 
 
        public int[][] getCard() {
            return card;
        }
 
        
        public void setCard(int[][] card) {
            this.card = card;
        }
 
        
        public void sort(int[][] card){
 
            
            for(int i = 0; i < 8; i++){
 
                for(int j = 0; j < 8-i; j++ ){
 
                    if(card[1][j] > card[1][j+1]){
                        int temp = card[1][j];
                        card[1][j] = card[1][j+1];
                        card[1][j+1] = temp;
                        
                        int temp2 = card[0][j];
                        card[0][j] = card[0][j+1];
                        card[0][j+1] = temp2;
                    }
                }
            }
 
 
            for(int i = 0; i < 8; i++){
 
                for(int j = 0; j < 8-i; j++){
                    
                    if(card[1][j] == card[1][j+1] && card[0][j] > card[0][j+1]){
 
                        int temp = card[0][j];
                        card[0][j] = card[0][j+1];
                        card[0][j+1] = temp;
                        
                    }
 
 
                }
            }
 
        }
 
        
        public int win(int[][] card){
 
            
            int intCount = 0;
           
 
 
           
            for(int k= 0; k < 7; k++){
                
                for(int j = k+1; j < 8; j++ ){
                   
                    for(int i = j+1; i < 9; i++){
                    	
                       if(card[1][k] == card[1][j] && card[1][j] == card[1][i]){
                            
 
                            if(card[0][k] != 0 && card[0][k] == card[0][j] -1 && card[0][k] == card[0][i] -2){
 
 
                               
                                intCount++;
                               
                                card[0][k] = 0;
                                card[0][j] = 0;
                                card[0][i] = 0;
                            }
                        }
 
                    }
                }
            }
            
           
            for(int k= 0; k < 7; k++){
                
                for(int j = k+1; j < 8; j++ ){
                    
                    for(int i = j+1; i < 9; i++){
                        
                        if(card[1][k] == card[1][j] && card[1][j] == card[1][i]){
                           
                            if(card[0][k] != 0 && card[0][k] == card[0][j] && card[0][k] == card[0][i]){
 
                                
                                intCount++;
                               
                                card[0][k] = 0;
                                card[0][j] = 0;
                                card[0][i] = 0;
                            }
                        }
                    }
                }
            }
            return intCount;
        }
 
 
    }
 
}