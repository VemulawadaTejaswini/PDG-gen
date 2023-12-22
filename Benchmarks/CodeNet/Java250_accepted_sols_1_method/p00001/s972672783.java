import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

 class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        ArrayList<Integer> al = new ArrayList<Integer>();
        try {
            while((str = br.readLine()) != null) {
                al.add( Integer.parseInt(str) );
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Collections.sort(al);
        Collections.reverse(al);
        for(int i=0; i<3; i++) {
            System.out.println(al.get(i));
        }
    }
}