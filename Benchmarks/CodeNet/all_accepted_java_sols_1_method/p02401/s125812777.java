import java.io.BufferedReader;
import java.io.InputStreamReader;
class Main {
    public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// ??\????????????????????????
            String line = null;
            hoge:while((line = br.readLine()) != null){
            	String lines[] = line.split(" ");
            	int x = Integer.parseInt(lines[0]);
            	String op = lines[1];
            	int y = Integer.parseInt(lines[2]);
            	switch(op){
            	case "+":
            		System.out.println(x + y);
            		break;
            	case "-":
            		System.out.println(x - y);
            		break;
            	case "*":
            		System.out.println(x * y);
            		break;
            	case "/":
            		System.out.println(x / y);
            		break;
            	case "?":
            		break hoge;
            	}
            }
    }
}