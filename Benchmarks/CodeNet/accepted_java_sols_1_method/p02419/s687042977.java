import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str,x;
        int i,j,sum;
        sum = 0;
        x = scan.nextLine();
        x = x.toLowerCase();
        while(true){
            str = scan.nextLine();
            if(str.equals("END_OF_TEXT")){
                break;
            }
            str = str.toLowerCase();
            String[] words = str.split(" ", 0);
            for(i=0;i<words.length;i++){
                if(x.equals(words[i])){
                    sum++;
                }
            }
        }
        System.out.println(sum);

        scan.close();

    }

}

