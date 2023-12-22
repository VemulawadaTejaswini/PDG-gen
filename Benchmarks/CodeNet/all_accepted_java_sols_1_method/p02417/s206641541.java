
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner=new Scanner(System.in);
        String alphabets="abcdefghijklmnopqrstuvwxyz";
        int[] albox=new int[alphabets.length()];
        while(scanner.hasNext()){
            String s=scanner.nextLine();
            s=s.toLowerCase();
            String[] chars=s.split("");
            for(String c:chars){
                int index=alphabets.indexOf(c);
                if(index==-1) continue;
                albox[index]++;
            }
        }
        for(int i=0;i<alphabets.length();i++){
            System.out.println(alphabets.charAt(i)+" : "+albox[i]);
        }
    }

}

