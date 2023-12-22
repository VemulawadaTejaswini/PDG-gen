import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int tmp,count;
        while(scan.hasNext()){
            tmp=scan.nextInt()+scan.nextInt();
            for(count = 1;tmp>=10;count++,tmp/=10);
            System.out.println(count);
        }
    }
}