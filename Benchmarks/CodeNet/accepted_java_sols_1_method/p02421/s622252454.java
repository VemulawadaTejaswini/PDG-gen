import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int taroScore=0,hanakoScore=0;
        for(int i=0;i<n;i++){
        	String[] str  = br.readLine().split(" ");
        	int compare = str[0].compareTo(str[1]);
        	if(compare > 0){
        		taroScore += 3;
        	}else if(compare==0){
        		taroScore++;
        		hanakoScore++;
        	}else{
        		hanakoScore +=3;
        	}
    	}
        System.out.println(taroScore + " " + hanakoScore);
    }
}