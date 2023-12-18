import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long K = sc.nextLong();
		long D = sc.nextLong();
		sc.close();
		int c = 0;
		long x_ = X;
		while(x_ != X%D){
			if(c == K){
				break;
			}
			if(x_ > 0){
				x_ -= D;
			}else{
				x_ += D;
			}
			c++;
			//System.out.println("["+c+"]"+x_);
		}
		if(c==K){
			System.out.println(Math.abs(x_));
		}else{
			if((K-c) % 2 == 0){
				System.out.println(Math.abs(x_));
			}else{
				if(x_>0){
					System.out.println(Math.abs(x_-D));
				}else{
					System.out.println(Math.abs(x_+D));
				}
			}
		}
	}
}

