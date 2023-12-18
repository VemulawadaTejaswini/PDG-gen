import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<9;i++){
            String name=sc.next();
            int s1=sc.nextInt();
            int s2=sc.nextInt();
            System.out.println(name+" "+(s1+s2)+" "+(s1*200+s2*300));
        }
    }
}
