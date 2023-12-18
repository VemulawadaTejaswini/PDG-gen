import java.util.*; 
public class Main{
    static public void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double masu1=sc.nextInt();
        double masu2=sc.nextInt();
       
        if(masu1!=1&&masu2!=1){
            double masu=masu1*masu2;
            System.out.print((long)Math.ceil(masu/2));
        }
        else{
            System.out.print(1);
        }
        sc.close();
    }
}