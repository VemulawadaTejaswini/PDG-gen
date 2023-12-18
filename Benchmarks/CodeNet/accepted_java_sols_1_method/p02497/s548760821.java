import java.util.Scanner;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int f = sc.nextInt();
        int r = sc.nextInt();
        int count=0;

 
        while(!((m==-1) && (f==-1) && (r==-1))){
            if(m==-1 || f==-1){
                System.out.printf("F");
            }
            else if(m+f>=80){
                System.out.printf("A");
            }
            else if(m+f>=65){
                System.out.printf("B");
            }
            else if(m+f>=50){
                System.out.printf("C");
            }
            else if(m+f>=30 && m+f<50){
                if(r>=50){
                    System.out.printf("C");
                }
                else{
                    System.out.printf("D");

                }

            }
            else{
                System.out.printf("F");
            }
                   System.out.printf("\n");
                    m = sc.nextInt();
                    f = sc.nextInt();
                    r = sc.nextInt();


                }

    }


}
    


    