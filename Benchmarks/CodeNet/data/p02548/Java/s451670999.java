import java.util.Scanner;

public class Main {
    void run(String[] args){
        Scanner scan=new Scanner(System.in);
        long answer=scan.nextInt();
        Integer i;
        Integer j;
        Integer sum;
        long count=0;
        for(i=1;i<=answer;i++){
            for(j=1;j<answer;j++){
                sum=i*j;
                if(answer-sum<answer){
                    count=count+1;
                    break;
                }
            }
        }
        System.out.println(count);
    }
    
    public static void main(String args[]){
        Main printer = new Main();
        printer.run(args);
    }
}