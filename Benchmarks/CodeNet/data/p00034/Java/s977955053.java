import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            String[] str = (scan.nextLine()).split(",");
            int[] dis = new int[10];
            int sum = 0;
            for(int i = 0;i < 10;i++){
                dis[i] = Integer.parseInt(str[i]);
                sum += dis[i];
            }
            int v1 = Integer.parseInt(str[10]);
            int v2 = Integer.parseInt(str[11]);
            int a = (int)(((double)(sum*v1)/(double)(v1+v2))+0.5);
            sum = 0;
            for(int i = 0;i < 10;i++){
                sum += dis[i];
                if(sum >= a){
                    System.out.println(i+1);
                    break;
                }
            }
        }
    }
}