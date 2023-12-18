import java.util.*;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n,i,j;
		String s;
		ArrayList<Integer> H = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13));
		ArrayList<Integer> D = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13));
		ArrayList<Integer> C = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13));
		ArrayList<Integer> S = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13));
		n = sc.nextInt();

		for(i=0;i<n;i++){
			s = sc.next();
			if(s.equals("H")){
				H.remove(H.indexOf(sc.nextInt()));
			}
			else if(s.equals("D")){
				D.remove(D.indexOf(sc.nextInt()));
			}
			else if(s.equals("S")){
				S.remove(S.indexOf(sc.nextInt()));
			}
			else if(s.equals("C")){
				C.remove(C.indexOf(sc.nextInt()));
			}
		}
			for(j=0;j<S.size();j++){
				if(S.equals(null)){
					break;
				}
				System.out.println("S "+S.get(j));
			}
			for(j=0;j<H.size();j++){
				if(H.equals(null)){
					break;
				}
				System.out.println("H "+H.get(j));
			}
			for(j=0;j<C.size();j++){
				if(C.equals(null)){
					break;
				}
				System.out.println("C "+C.get(j));
			}
			for(j=0;j<D.size();j++){
				if(D.equals(null)){
					break;
				}
				System.out.println("D "+D.get(j));
			}
	}

}

