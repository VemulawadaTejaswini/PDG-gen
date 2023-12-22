import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);

    int a = scan.nextInt();
    int[] getNum = new int[a];
    int count = 0; //素数の個数

    //標準入力を配列に格納
    for(int i = 0; i < getNum.length; i++) {
    getNum[i] = scan.nextInt();
    }
    for(int i = 0; i < getNum.length; i++) {
    if(isPrime(getNum[i]) == true) {
    	count++;
    }
    }
    System.out.println(count);
  }
    public static boolean isPrime(int num) {
  //素数の判別
    if(num < 2) {
    	return false;
    }
    else if(num == 2) {
    	return true;
    }
    else if(num % 2 == 0) {
    	return false;
    }

    double sqrtNum = Math.sqrt(num);
    for(int i = 3; i <= sqrtNum; i+= 2) {
    	if(num % i == 0) {
    		return false;
    	}
    }
    return true;
  }
}
