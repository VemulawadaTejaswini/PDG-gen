import java.util.Scanner;


public class Main {


	public static void main(String[] args) {

		int h,w;

		Scanner sc = new Scanner(System.in);


		StringBuilder buffer = new StringBuilder();

		while(true){
			try{
				h = sc.nextInt();
				w = sc.nextInt();
			}catch(Exception e){
				e.printStackTrace();
				break;
			}
			if(h == 0 && w == 0)
			{
				break;
			}

			for(int i = 0; i < h;++i)
			{
				for(int j = 0; j< w; ++j)
				{
					if(i == 0 || i == h-1 || j == 0 || j == w-1)
					{
						buffer.append("#");
					}else{
						buffer.append(".");
					}
				}
				buffer.append("\n");
			}
			System.out.println(buffer);
			buffer.delete(0, buffer.length());
		}
		sc.close();

	}

}