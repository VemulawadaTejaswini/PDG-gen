import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
        String s=br.readLine();
        for(int i=0;i<s.length();i++){
          if(Character.isUpperCase(s.charAt(i))){
            sb.append(s.substring(i,i+1).toLowerCase());
          }else{
            sb.append(s.substring(i,i+1).toUpperCase());
          }
        }
        System.out.println(sb);
	}
}