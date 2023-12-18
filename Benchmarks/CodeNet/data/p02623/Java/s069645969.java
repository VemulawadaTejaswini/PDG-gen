
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] temp = br.readLine().split(" ");
        int a = Integer.parseInt(temp[0]);
        int b = Integer.parseInt(temp[1]);
        int time = Integer.parseInt(temp[2]);

        int[] books = new int[a+b];

        temp = br.readLine().split(" ");
        for(int i=0;i<a;i++){
            books[i] = Integer.parseInt(temp[i]);
        }

        temp = br.readLine().split(" ");
        for(int i=a; i<a+b;i++){
            books[i] = Integer.parseInt(temp[i-a]);
        }

        Arrays.sort(books);
        int cnt = 0;
        for(int next : books){
            if(time - next >= 0){
                time -= next;
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}
