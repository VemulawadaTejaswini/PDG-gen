import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	while(scan.hasNext()){
	    int data = scan.nextInt();
	    for(int i =-1;;i--){
		if(sosuu(data+i)){
		    System.out.printf("%d ",data+i);
		    break;
		}
	    }
	    for(int i =1;;i++){
		if(sosuu(data+i)){
		    System.out.printf("%d\n",data+i);
		    break;
		}
	    }
	}
    }
    static boolean sosuu(int num){
	if(num == 2)return false;
	if((num % 2) == 0)return false;
	if((num % 3) == 0)return false;
	for(int i = 3;i * i< num;i +=2){
	    if( (num % i)==0)return false;
	}
	return true;
    }
}