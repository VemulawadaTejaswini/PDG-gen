import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s="";
        while(true){
            int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
            if(a==-1 && b==-1 &&c==-1) break;
            if(a==-1 || b==-1) s="F";
            else if(a+b>=80) s="A";
            else if(a+b>=65) s= "B";
            else if(a+b>=50 || (a+b>=30 && c>=50)) s= "C";
            else if(a+b>=30) s= "D";
            else if(a+b<30) s= "F";
            System.out.println(s);
        }
    }
}
