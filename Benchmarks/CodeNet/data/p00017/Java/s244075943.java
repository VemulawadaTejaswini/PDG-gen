import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String[] save = new String[80];
        boolean bool = false;
        for(int k = 0;;k++){
        	 save[k] = br.readLine();
             String[] str = save[k].split(" ");
	        for(int i = 0 ; i < str.length;i++){
	            if(str[i].length()<3 || str[i].length()>5){
	                continue;
	            }
	            for(int j = 0 ;j<26;j++){
	                bool = check(str[i],j+1);
	                if(bool == true){
	                	for(int p = 0 ; p <= k ; p++){
	                		print(save[p].split(" "),j+1);
	                		System.out.println("");
	                	}
	                	System.exit(0);
	                }
	                else
	                	continue;
	            }
	        }
  		}
    }
    public static void print(String[] str,int n){
        for(int i = 0 ; i < str.length;i++){
            for(int j = 0 ; j < str[i].length();j++){
                if(str[i].charAt(j)=='.')
                    System.out.print(".");
                else if(str[i].charAt(j)<97+n)
                    System.out.print((char)(str[i].charAt(j)+26-n));
                else
                    System.out.print((char)(str[i].charAt(j)-n));
            }
            System.out.print(" ");
        }
    }
    public static boolean check(String a,int n){
        String th = "";
        for(int i = 0 ; i < a.length(); i++){
            if(a.charAt(i)<97+n)
                th+=(char)(a.charAt(i)+26-n);
            else
                th+=(char)(a.charAt(i)-n);
        }
        if(th.equals("this")||th.equals("the")||th.equals("that")){
            return true;
        }
        return false;
    }
}