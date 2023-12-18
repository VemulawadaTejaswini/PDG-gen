import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    try(Scanner sc = new Scanner(System.in)){
        while(true){
                int num = sc.nextInt();
                double score[] = new double[num];
                double ave = 0;
                double var = 0;
            if(num==0)
              break;
            for(int i=0;i<num;i++){
                score[i] = sc.nextInt();
                ave = ave + (score[i]/num);
            }

            for(int i=0;i<num;i++){
                var = var + ((score[i] - ave)*(score[i] - ave) / num);
            }
            System.out.printf("%s\n",Math.sqrt(var));
        }
        }
  }
}

