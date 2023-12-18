import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
	public void run(){
		Scanner sc = new Scanner(System.in);
		char[] in = sc.next().toCharArray();
		int size = in.length;
		int ret = 0;
		for(int i = 0; i < (size+1)/2;i++){
			if(in[i] == 'i'){
				if(in[size-i-1] != 'i'){
					ret++;
				}
			}
			if(in[i] == 'w'){
				if(in[size-i-1] != 'w'){
					ret++;
				}
			}
			if(in[i] == '('){
				if(in[size-i-1] != ')'){
					ret++;
				}
			}
			if(in[i] == ')'){
				if(in[size-i-1] != '('){
					ret++;
				}
			}
		}
		System.out.println(ret);
	}
	public static void main(String Args[]){
		Main t = new Main();
		t.run();
	}
}