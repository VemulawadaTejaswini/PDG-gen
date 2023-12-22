import java.util.*;
import java.io.*;
import static java.lang.Integer.parseInt;

public class Main {
    
    public static void main(String[] arg) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> al = new ArrayList<>();
        int i = 0,j=0;
        while(i<10){
            int x = parseInt(br.readLine());
            if(0<=x&&x<=10000){
            al.add(x);
            }
            i++;
        }
        Collections.sort(al,Comparator.reverseOrder());
        while(j<3){
            System.out.println(al.get(j));
            j++;
        }
    }
}