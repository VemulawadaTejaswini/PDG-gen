public class Main {
	
	public static void main (String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
        int[] point = new int[2];
        
        int N = sc.nextInt();
        int D = sc.nextInt();
        int ans = 0;
        
        
        for(int i = 0; i < N; i++)
        {
                point[0] = sc.nextInt();
                point[1] = sc.nextInt();
            
                if(Math.sqrt(point[0]* point[0] + point[1] * point[1]) < D)
                {
                        ans ++;
                }
        
        }
        System.out.println(ans);
        
	}
}