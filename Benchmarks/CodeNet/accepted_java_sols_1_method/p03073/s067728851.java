import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      	String a = sc.next();
      	char[] S = new char[a.length()];
      	for (int i=0; i<a.length(); i++){
          S[i] = a.charAt(i);
        }
		int counter = 0;
      	char key = S[0];
      	for (int i=0; i<a.length(); i++){
          if (key != S[i]){
            counter++;
          }
          if(key == '0'){
            key = '1';
          }else{
            key = '0';
          }
        }
      	System.out.println(counter);
    }
}