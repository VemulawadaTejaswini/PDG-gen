import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n != 0){
			Hashtable<String,Integer> buy = new Hashtable<String,Integer>();
			for(int i = 0 ; i < n ; i++){
				buy.put(sc.next(), sc.nextInt());
			}
			int m = sc.nextInt();
			Hashtable<String, String[]> recipe = new Hashtable<String, String[]>();
			for(int i = 0 ; i < m ; i++){
				String name = sc.next();
				sc.nextInt();
				sc.skip(" ");
				recipe.put(name, sc.nextLine().split(" "));
			}
			System.out.println(minprice(sc.next(), buy, recipe));
			n = sc.nextInt();
		}
		sc.close();
	}
	static int minprice(String name, Hashtable<String, Integer> buy, Hashtable<String, String[]> recipe){
		int buyprice = (Integer)buy.get(name);
		int makeprice = buyprice;
		if(recipe.containsKey(name)){
			makeprice = 0;
			String[] elements = (String[])recipe.get(name);
			for(String element : elements){
				makeprice += minprice(element, buy, recipe);
			}
		}
		return buyprice < makeprice ? buyprice : makeprice;
	}
}