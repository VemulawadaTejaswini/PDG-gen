import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int f = sc.nextInt();
        int r = sc.nextInt();
        while(m!=-1||f!=-1||r!=-1){
            if(m==-1||f==-1) System.out.println("F");
            else{
                if(m+f>=65){
                    if(m+f>=80) System.out.println("A");
                    else        System.out.println("B");
                }else{
                    if(m+f>=30){
                        if(m+f>=50) System.out.println("C");
                        else{
                            if(r>=50) System.out.println("C");
                            else      System.out.println("D");
                        }
                    }else System.out.println("F");
                }
            }
            m = sc.nextInt();
            f = sc.nextInt();
            r = sc.nextInt();
        }
    }
}
