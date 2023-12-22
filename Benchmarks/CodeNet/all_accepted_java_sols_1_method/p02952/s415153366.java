import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt=0;
        for (int i=1;i<=n;i++){
            if (String.valueOf(i).length()%2==1){
                cnt++;
            }
        }
        System.out.println(cnt);
    }

}

