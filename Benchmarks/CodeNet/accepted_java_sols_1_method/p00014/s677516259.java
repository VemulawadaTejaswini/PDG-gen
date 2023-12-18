import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int x=sc.nextInt(),sum=0;
            for(int i=x;i<600;i+=x){
             	sum+=i*i*x;
            }
            System.out.println(sum);
        }
    }
}