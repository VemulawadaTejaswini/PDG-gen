import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());

//        int n = Integer.parseInt(st.nextToken());
        String s = br.readLine();
        String[] arr = s.split(" ");
        char a = arr[0].charAt(0);
        char b = arr[1].charAt(0);

        if(a=='H')
            System.out.println(b);
        else{
            if (b=='H')
                System.out.println('D');
            else
                System.out.println('H');
        }


    }


}
