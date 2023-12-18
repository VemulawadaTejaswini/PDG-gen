import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Integer; 
 
public class Main {
    public static void main(String[] args) {
 
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
 
        String takoyaki = null;
        String oishisa = null;
        try {
            takoyaki = br.readLine();
            oishisa = br.readLine();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Integer takoyakiInt= Integer.parseInt(takoyaki);
        String[] oishisaDankai = oishisa.split(" ");
        int kaihuku = 0;
        for (int i = 0;i < takoyakiInt; i++){
                for  (int j = i+1;j < takoyakiInt; j++){
                        Integer x= Integer.parseInt(oishisaDankai[i]);
                        Integer y= Integer.parseInt(oishisaDankai[j]);
                        kaihuku = kaihuku + x*y;
                }
        }
        System.out.println(kaihuku);
    } 
}