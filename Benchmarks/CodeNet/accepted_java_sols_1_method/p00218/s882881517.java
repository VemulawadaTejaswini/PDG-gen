import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(true){
            int n=sc.nextInt();
            if(n==0){
                break;
            }
            for(int i=0;i<n;i++){
                double pm=sc.nextInt();
                double pe=sc.nextInt();
                double pj=sc.nextInt();
                if(pm==100||pe==100||pj==100){
                    System.out.println("A");
                }else if((pm+pe)/2.0>=90){
                    System.out.println("A");
                }else if((pm+pe+pj)/3.0>=80){
                    System.out.println("A");
                }else if((pm+pe+pj)/3.0>=70){
                    System.out.println("B");
                }else if((pm+pe+pj)/3.0>=50&&pm>=80){
                    System.out.println("B");
                }else{
                    System.out.println("C");
                }
            }
        }
    }
}
