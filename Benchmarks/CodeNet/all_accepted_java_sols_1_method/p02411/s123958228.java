import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int m = sc.nextInt();
            int k = sc.nextInt(); 
            int r = sc.nextInt(); 
            if(m==-1 && k==-1 && r==-1) break;
             if(m==-1||k==-1){
                System.out.println("F");
             }else if(m+k>79){
                System.out.println("A");
             }else if(m+k>64){
                 System.out.println("B");
             }else if(m+k>49){
                 System.out.println("C");
             }else if(m+k>29){
                 if(r>49){System.out.println("C");}
                 else{System.out.println("D");}
             }else{
                 System.out.println("F");
             }
    
        }
    }
}
