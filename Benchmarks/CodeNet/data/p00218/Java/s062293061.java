import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        int pm,pe,pj;

        while((n = sc.nextInt())!=0){
            for(int i=0;i<n;i++){
                pm = sc.nextInt();
                pe = sc.nextInt();
                pj = sc.nextInt();

                if((pm==100 || pe==100 || pj==100) || (pm+pe)/2>=90 || (pm+pe+pj)/3>=80){
                    System.out.println("A");
                }else if((pm+pe+pj)/3>=70 || ((pm+pe+pj)/3>=50 && (pm>=80 || pe>=80))){
                    System.out.println("B");
                }else{
                    System.out.println("C");
                }
            }
        }
    }
}
