import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            int numa = sc.nextInt();
            int numb = sc.nextInt();
            if(numa == 0 && numb == 0){
                break;
            }

            if(numa > numb){
                System.out.println(numb + " " + numa);
            }
            else{
                System.out.println(numa + " " + numb);
            }
        }
    }
}
