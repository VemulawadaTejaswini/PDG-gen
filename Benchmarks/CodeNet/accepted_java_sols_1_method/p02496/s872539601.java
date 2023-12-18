import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String d;
        int p=0;
        int n = sc.nextInt();
        int[][] card = new int[n][2];
        
        for(int i=0;i<n;i++){
            d = sc.next();
            if(d.equals("S")){
                p=0;
            }else if(d.equals("H")){
                p=1;
            }else if(d.equals("C")){
                p=2;
            }else if(d.equals("D")){
                p=3;
            }
            
            card[i][0] = p;
            card[i][1] = sc.nextInt();
        }
        
        for(int i=0;i<4;i++){
            loop1:
            for(int j=1;j<=13;j++){
                for(int k=0;k<n;k++){
                    if((card[k][0]==i)&&(card[k][1]==j)){
                        continue loop1;
                    }
                    
                }
                String t="?";
                if(i==0){
                    t="S";
                }else if(i==1){
                    t="H";
                }else if(i==2){
                    t="C";
                }else if(i==3){
                    t="D";
                }
                
                System.out.println(t+" "+j);
            }
        }
        
    }
}