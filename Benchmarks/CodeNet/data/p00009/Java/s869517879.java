import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		List<Integer> a = new ArrayList<Integer>();

		try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNextInt()) {
                int b = sc.nextInt();
                a.add(b);
            }
        }

		boolean flag = false;
		List<Integer> list = new ArrayList<Integer>();
		for (int test: a){
			for(int i=2;test>=i;i++){
				if(i==2){
					list.add(i);
				}
				for(int k=2;i>k;k++){
					if(i%k==0){
						flag = false;
						break;
					}else{
						flag = true;
					}
				}
				if(flag){
					list.add(i);
				}
			}
			System.out.print(list.size());
		}
	}

}