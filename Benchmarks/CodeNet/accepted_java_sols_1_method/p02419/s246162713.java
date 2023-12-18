import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String W = sc.nextLine();
        String buf;
        while(!((buf = sc.nextLine()).equals("END_OF_TEXT"))){
            sb.append(buf.toLowerCase()).append(System.lineSeparator());
        }
        int counter = 0;
        String[] words = sb.toString().split("[ ,.\"\n]");
        for(int i = 0; i < words.length; i++){
            if(words[i].matches(W)) counter++;
        }
        System.out.println(counter);
    }
}

