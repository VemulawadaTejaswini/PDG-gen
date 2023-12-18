public class Main {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	List<Double> list = new ArrayList<>();
	while(sc.hasNext()){
		double x = sc.nextDouble();
		list.add(x);
	}
	
		Double max = list.get(0);
		Double min = list.get(0);
		for (int i = 1; i < list.size(); i++){
			Double v = list.get(i);
			if(v > max){
				max = v;
			}
			if(v < min){
				min = v;
			}
		}
		
		System.out.println(max);
		System.out.println(min);
		System.out.println(max-min);
				
	}
	
}