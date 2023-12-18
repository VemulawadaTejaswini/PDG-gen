import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line;
            /* input */
            while(true){
                line = br.readLine();
                
                String str = line.split(" ")[0], type = line.split(" ")[1];
                
                if(type.equals("X")) break;
                
                if(str.indexOf('_')>-1){
                	if(type.equals("D")){
                		System.out.println(str);
                	} else {
                		String[] s = str.split("_");
                		if(type.equals("U")){
                			for(String t : s){
                				System.out.print(t.substring(0,1).toUpperCase() + t.substring(1));
                			}
                			System.out.println();
                		} else {
                			System.out.print(s[0]);
                			for(int i=1;i<s.length;i++){
                				System.out.print(s[i].substring(0,1).toUpperCase() + s[i].substring(1));
                			}
                			System.out.println();
                		}
                	}
                } else {
        			String[] s = str.split("((?<=[a-z])||(?<=[A-Z]))(?=[A-Z])");
            		if(type.equals("D")){
            			System.out.print(s[0].toLowerCase());
            			for(int i=1;i<s.length;i++){
            				System.out.print("_" + s[i].toLowerCase());
            			}
            			System.out.println();
            		} else if(type.equals("U")){
            			for(String t : s){
            				System.out.print(t.substring(0,1).toUpperCase() + t.substring(1));
            			}
            			System.out.println();
            		} else {
            			System.out.print(s[0]);
            			for(int i=1;i<s.length;i++){
            				System.out.print(s[i].substring(0,1).toUpperCase() + s[i].substring(1));
            			}
            			System.out.println();
            		}
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}