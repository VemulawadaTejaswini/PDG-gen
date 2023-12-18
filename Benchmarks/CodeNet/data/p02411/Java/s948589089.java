import java.util.Scanner;

class Main{
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        int m,f,r;
        while (sc.hasNext()) {
            m = sc.nextInt();
            f = sc.nextInt();
            r = sc.nextInt();
 
            if(m==-1||f==-1) {
                if(m==f&&f==r)
                    return;
                else
                    System.out.println("F");
                continue;
            }
 
            if(m+f>=80)
                System.out.println("A");
            else if(m+f>=65)
                System.out.println("B");
            else if(m+f>=50)
                System.out.println("C");
            else if(m+f>=30) {
                if(r>=50)
                    System.out.println("C");
                else
                    System.out.println("D");
            }else
                System.out.println("F");
        }
    }
}

