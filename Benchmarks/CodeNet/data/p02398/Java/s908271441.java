import java.util.Scanner;

/*
 class ToiN implements Toi{
	public void exec(String[] args){
		solve();
	}
	public void solve(){
	
	}
}
  */

interface Toi{
	public void exec(String[] args);
}

public class Main {
	public static void main(String[] args){
	Toi toi = new Toi12();
	toi.exec(args);
	}
}

class Toi8 implements Toi{
	public void exec(String[] args){
		solve();
	}
	public void solve(){
		Scanner sc = new Scanner(System.in);
		int[] whxyr = new int[5];
		for(byte i = 0;i < whxyr.length;i++){
			whxyr[i] = sc.nextInt();
		}
		calc(whxyr);
		int[] renewWh = {whxyr[0] - whxyr[4], whxyr[1] - whxyr[4], whxyr[2] + whxyr[4], whxyr[3] + whxyr[4]};
		if(renewWh[0] >= 0 && renewWh[1] >= 0 && renewWh[2] <= whxyr[0] && renewWh[3] <= whxyr[1]){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
	public int[] calc(int[] array){
		int tmp;
		for(byte i = 0;i < array.length - 2;i++){
			if(array[i + 2] < 0){
				tmp = array[i];
				array[i] = array[i + 2];
				array[i + 2] = tmp;
			}
		}
		return array;
	}
}

class Toi9 implements Toi{
	public void exec(String[] args){
		solve();
	}
	public void solve(){
		for(short i = 0;i < 1000;i++){
			System.out.println("Hello World");
		}
	}
}

class Toi10 implements Toi{
	public void exec(String[] args){
		solve();
	}
	public void solve(){
		short[] tmp = new short[10000];
		Scanner sc = new Scanner(System.in);
		for(short i = 0;i < 10000;i++) {
			try {
				tmp[i] = sc.nextShort();
				if (tmp[i] == 0) {
					break;
				}
			}catch (Exception e){
				break;
			}
		}
		for(short i = 1;i <= 10000;i++){
			if(tmp[i-1] == 0){
				break;
			}
			System.out.println("Case " + i + ": " + tmp[i-1]);
		}
	}
}

class Toi11 implements Toi{
	public void exec(String[] args){
		solve();
	}
	public void solve(){
		short[] xy = new short[6000];
		Scanner sc = new Scanner(System.in);
		short point = 0;
		for(short i = 0;i < 3000;i++) {
			try {
				xy[i] = sc.nextShort();
				xy[i+3000] = sc.nextShort();
			}catch (Exception e){
				break;
			}
			if (xy[i] == 0 && xy[i+3000] == 0){
				point = i;
				break;
			}
		}
		for(short i = 1;i <= point;i++){
			if(xy[i-1] < xy[i+3000-1]) {
				System.out.println(xy[i-1] + " " + xy[i+3000-1]);
			}else {
				System.out.println(xy[i+3000-1] + " " + xy[i-1]);
			}
		}
	}
}

class Toi12 implements Toi{
	public void exec(String[] args){
		solve();
	}
	public void solve(){
		short[] abc = new short[5];
		Scanner sc = new Scanner(System.in);
		for (byte i = 0;i < 3;i++){
			abc[i] = sc.nextShort();
		}
		short[] f = new short[5000];
		for(short i = 0;i < 5000;i++){
			f[i] = 0;
		}
		calc(abc[2], f);
		short count = 0;
		for(short i = 0;i < 5000;i++) {
			if (f[i] >= abc[0] && f[i] <= abc[1]) {
				count++;
			} else {
				continue;
			}
		}
		System.out.println(count);
	}
	public void calc(short inputNum,short[] outputArray){
		for(short i = 1,j = 0;i <= inputNum;i++){
			if(inputNum % i ==  0){
				outputArray[j] = i;
				j++;
			}
		}
	}
}
