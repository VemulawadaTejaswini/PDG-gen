import java.util.Scanner;

public class Main {
    public static void main(String...args){
        Scanner scanner=new Scanner(System.in);
        int N =scanner.nextInt();
        int M =scanner.nextInt();

        int[] penaltyCount=new int[N+1];
        int penalty=0;
        int win=0;

        for(int i=0; i<M; i++){
            int p=scanner.nextInt();
            String result=scanner.next();

            if(penaltyCount[p]==-1){
            continue;
            }
            if(result.equals("WA")){
                penaltyCount[p]++;
            }else{
                win++;
                penalty=penalty+penaltyCount[p];
                penaltyCount[p]=-1;
            }
        }
        System.out.println(win+" "+penalty);
    }
}




