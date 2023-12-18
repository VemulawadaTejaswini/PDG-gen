import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
        
    int[] intArray = Arrays.stream(str.split(" ")) //" "で区切ってString配列へ
    .mapToInt(Integer::parseInt) //数値にして
    .toArray(); //配列へ

    int n= intArray[0];
    int powder= intArray[1];

        
    int needPowder=0;
    int min=10000;
    
    for(int i=0;i<n;i++){
        int a = Integer.parseInt(br.readLine());
        needPowder+=a;
        
        if(min>=a){
            min=a;
        }
    }   
        
    
    int lastPowder=powder-needPowder;
    
    int lastD=lastPowder/min;
  
        System.out.println(n+lastD);
    }
}
