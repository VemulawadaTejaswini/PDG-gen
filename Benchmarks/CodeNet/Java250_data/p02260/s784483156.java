import java.util.Scanner;

/**
 * Created by ??\??? on 2016/12/6.
 */
public class Main {
    static int si(String s){
        return Integer.parseInt(s);
    }

    static int run(String[] args){
        Scanner scan  = new Scanner(System.in);
        int T = si(scan.nextLine());
        int sum = 0;
        String[] lines = scan.nextLine().split(" ");
        for(int i = 0;i < lines.length;i++){
            int min = i;
            for(int j = i+1;j<lines.length;j++){
                if(si(lines[min])>si(lines[j])){
                    min = j;

                }
            }
            if(min!=i) {
                String s = lines[i];
                lines[i] = lines[min];
                lines[min] = s;
                sum++;
            }
        }
        for(int i = 0;i<lines.length;i++){
            if(i==0)
                System.out.print(lines[0]);
            else
                System.out.print(" "+lines[i]);
        }
        System.out.println();
        System.out.println(sum);
        return 0;
    }
    public static void main(String[] args){
        run(args);
    }

}