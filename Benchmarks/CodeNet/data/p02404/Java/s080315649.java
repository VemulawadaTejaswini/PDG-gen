import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		while (true) {
			String str = br.readLine();

			String[] num = getElement(str);

			int h = Integer.parseInt(num[0]);
			int w = Integer.parseInt(num[1]);

			if (h == 0 && w == 0) {
				break;
			}
			for (int i = 0; i < h; i++) {
				if(i==0||i==h-1){
					for (int j = 0; j < w; j++) {
						System.out.print("#");
					}
				}else{
					for (int j = 0; j < w; j++) {
						if(j==0||j==w-1){
							System.out.print("#");
						}else{
							System.out.print(".");
						}
					}
				}
				System.out.print("\r\n");
			}
			System.out.print("\r\n");
		}

	}

	//??????????????????????????????????????????
	public static String[] getElement(String element) {
		return (element.split(" "));
	}
}