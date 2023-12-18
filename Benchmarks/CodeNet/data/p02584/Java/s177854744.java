import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long K = sc.nextLong();
		long D = sc.nextLong();
		sc.close();
		long c = 0;
		long x_ = X;
		/*while(x_ != X%D){
			if(c == K){
				break;
			}
			if(x_ > 0){
				x_ -= D;
			}else{
				x_ += D;
			}
			c++;
			System.out.println("["+c+"]"+x_);
		}*/
		c = (-(X % D) + x_) / D;
		x_ -= D*c;
		if(c==K){
			System.out.println(Math.abs(x_));
		}else if(c>K){
			x_ += D*(c-K);
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

