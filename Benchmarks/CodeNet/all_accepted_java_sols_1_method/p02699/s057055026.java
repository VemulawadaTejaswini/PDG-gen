import java.util.*;


public class Main {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int sheep=sc.nextInt(); //羊の数
        int wolves=sc.nextInt(); //狼の数
        
            if(sheep>wolves)
            {
                System.out.println("safe"); //襲われない
            }
            else
            {
                System.out.println("unsafe"); //襲われる
            }
        
    }
}



