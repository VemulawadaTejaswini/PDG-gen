import java.io.*;

class Main{


public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int answer = 0;
    for(int i = 0;i < n; i++){
        int number = Integer.parseInt(br.readLine());
        if(isPrime(number)) answer++;
    }
    System.out.println(answer);
    }

private static boolean isPrime(int numb){
    if(numb == 2 || numb == 3 || numb == 5 || numb == 7) {
	    return true;
	    }
    if(numb % 2 == 0) {
	    return false;
	    }
    for(int j=3;j <= Math.sqrt(numb);j++){
        if(numb % j == 0){ 
            return false;}
    }
    return true;
    }
}
