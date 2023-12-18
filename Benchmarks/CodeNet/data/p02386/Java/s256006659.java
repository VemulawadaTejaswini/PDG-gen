import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Dice di[] = new Dice[n];
        
        for(int i = 0; i < n; i++){
            di[i] = new Dice(sc);
        }
        
        boolean hantei = true;
        for(int x = 0; x < n; x++){
            for(int y = 0; y < n; y++){
            	if(x != y && Dice.check(di[x],di[y])){
                    hantei = false;
                    break;
                }
            }
        }
        
        if(hantei){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}

class Dice{
    int d1[] = new int[2];
    int d2[] = new int[4];
    
    Dice(Scanner sc){
        d1[0] = sc.nextInt();
        d2[0] = sc.nextInt();
        d2[1] = sc.nextInt();
        d2[2] = sc.nextInt();
        d2[3] = sc.nextInt();
        d1[1] = sc.nextInt();
    }
    
    void turnN(){
        int d0 = d1[0];
        d1[0] = d2[0];
        d2[0] = d1[1];
        d1[1] = d2[3];
        d2[3] = d0;
    }
    
    void turnS(){
        int d0 = d1[0];
        d1[0] = d2[3];
        d2[3] = d1[1];
        d1[1] = d2[0];
        d2[0] = d0;
    }
    
    void turnE(){
        int d0 = d1[0];
        d1[0] = d2[2];
        d2[2] = d1[1];
        d1[1] = d2[1];
        d2[1] = d0;
    }
    
    void turnW(){
        int d0 = d1[0];
        d1[0] = d2[1];
        d2[1] = d1[1];
        d1[1] = d2[2];
        d2[2] = d0;
    }
    
    static boolean check(Dice dice1,Dice dice2){
        boolean a = false;
        boolean b = true;
    	
        	if((dice1.d1[0] == dice2.d1[0]) || (dice1.d1[0] == dice2.d1[1]) ||(dice1.d1[0] == dice2.d2[0]) ||(dice1.d1[0] == dice2.d2[1]) ||(dice1.d1[0] == dice2.d2[2]) || (dice1.d1[0] == dice2.d2[3])){
        }else{
            b = false;
        }
        if((dice1.d1[1] == dice2.d1[0]) || (dice1.d1[1] == dice2.d1[1]) ||(dice1.d1[1] == dice2.d2[0]) ||(dice1.d1[1] == dice2.d2[1]) ||(dice1.d1[1] == dice2.d2[2]) || (dice1.d1[1] == dice2.d2[3])){
        }else{
            b = false;
        }
    	if((dice1.d2[0] == dice2.d1[0]) || (dice1.d2[0] == dice2.d1[1]) ||(dice1.d2[0] == dice2.d2[0]) ||(dice1.d2[0] == dice2.d2[1]) ||(dice1.d2[0] == dice2.d2[2]) || (dice1.d2[0] == dice2.d2[3])){
        }else{
            b = false;
        }
    	if((dice1.d2[1] == dice2.d1[0]) || (dice1.d2[1] == dice2.d1[1]) ||(dice1.d2[1] == dice2.d2[0]) ||(dice1.d2[1] == dice2.d2[1]) ||(dice1.d2[1] == dice2.d2[2]) || (dice1.d2[1] == dice2.d2[3])){
        }else{
            b = false;
        }
    	if((dice1.d2[2] == dice2.d1[0]) || (dice1.d2[2] == dice2.d1[1]) ||(dice1.d2[2] == dice2.d2[0]) ||(dice1.d2[2] == dice2.d2[1]) ||(dice1.d2[2] == dice2.d2[2]) || (dice1.d2[2] == dice2.d2[3])){
        }else{
            b = false;
        }
    	if((dice1.d2[3] == dice2.d1[0]) || (dice1.d2[3] == dice2.d1[1]) ||(dice1.d2[3] == dice2.d2[0]) ||(dice1.d2[3] == dice2.d2[1]) ||(dice1.d2[3] == dice2.d2[2]) || (dice1.d2[3] == dice2.d2[3])){
        }else{
            b = false;
        }
        
        for(int x = 0; x < 6; x++){
        	if(b){
        	}else{
        		break;
        	}
            if(dice1.d1[0] == dice2.d1[0]){
                for(int y = 0; y < 5; y++){
                    if(dice1.d2[0] == dice2.d2[0] && dice1.d2[1] == dice2.d2[1] && dice1.d2[2] == dice2.d2[2] && dice1.d2[3] == dice2.d2[3]){
                        a = true;
                        break;
                    }else if(y == 4){
                        break;
                    }else{
                        dice2.turnN();
                        dice2.turnE();
                        dice2.turnS();
                    }
                }
            }
            if(x == 0 || x == 4){
                dice2.turnN();
            }else{
                dice2.turnE();
            }
        }
         
         return a;
    }
}
