import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int leye[]=new int[4];
        int reye[]=new int[4];
        for(int i=0;i<4;i++){
            leye[i]=0;
            reye[i]=0;
        }
        while(sc.hasNext()){
            double l=sc.nextDouble();
            double r=sc.nextDouble();
            if(l>=1.1){
                leye[0]++;
            }else if(l>=0.6){
                leye[1]++;
            }else if(l>=0.2){
                leye[2]++;
            }else{
                leye[3]++;
            }
            if(r>=1.1){
                reye[0]++;
            }else if(r>=0.6){
                reye[1]++;
            }else if(r>=0.2){
                reye[2]++;
            }else{
                reye[3]++;
            }
        }
        for(int i=0;i<4;i++){
            System.out.println(leye[i]+" "+reye[i]);
        }
    }
}
