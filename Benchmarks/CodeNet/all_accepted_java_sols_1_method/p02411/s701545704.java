import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int i=0;;i++){
        int m,f,r;
        m=sc.nextInt();
        f=sc.nextInt();
        r=sc.nextInt();
if(m==-1&&f==-1&&r==-1){
break;
} else if(m==-1||f==-1){
System.out.println("F");
    }else{

        int g=m+f;
             if(g>=80){
                System.out.println("A");
            }else if(g>=65){
                System.out.println("B");
            }else if(g>=50){
                System.out.println("C");
            }else if(g>=30&&r<50){
                System.out.println("D");
            }else if(g>=30&&r>=50){
                System.out.println("C");
        }else if(g<30){
                System.out.println("F");
        }
    }

}    sc.close();
        }

}

