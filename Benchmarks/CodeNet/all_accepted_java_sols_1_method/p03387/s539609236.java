import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int cntOdd = 0;
	int A = Integer.parseInt(sc.next());
	int B = Integer.parseInt(sc.next());
	int C = Integer.parseInt(sc.next());
	int max = B;
	if(A>B) max = A;
	if(max<C) max = C;

	if((max-A)%2!=0 && A!=max) cntOdd++;
	if((max-B)%2!=0 && B!=max) cntOdd++;
	if((max-C)%2!=0 && C!=max) cntOdd++;

	if(cntOdd==0) {
	    System.out.println((max-A)/2 + (max-B)/2 + (max-C)/2);
	}else if(cntOdd == 1) {
	    max++;
	    System.out.println((max-A)/2 + (max-B)/2 + (max-C)/2 + 1);
	}else if(cntOdd == 2) {
	    System.out.println((max-A)/2 + (max-B)/2 + (max-C)/2 + 1);
	}

    }
}