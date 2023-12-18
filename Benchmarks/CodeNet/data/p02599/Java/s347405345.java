import java.io.*; 
import java.util.*; 
  
public class Main 
{ 
  
    // Each segment of the segment tree would be a set 
    // to maintain distinct elements 
    static HashSet<Integer>[] segment; 
  
    // Build the segment tree 
    // i denotes current node, s denotes start and 
    // e denotes the end of range for current node 
    static void build(int i, int s, int e, int[] arr) 
    { 
  
        // If start is equal to end then 
        // insert the array element 
        if (s == e) 
        { 
            segment[i].add(arr[s]); 
            return; 
        } 
  
        // Else divide the range into two halves 
        // (start to mid) and (mid+1 to end) 
        // first half will be the left node 
        // and the second half will be the right node 
        build(2 * i, s, (s + e) / 2, arr); 
        build(1 + 2 * i, 1 + (s + e) / 2, e, arr); 
  
        // Insert the sets of right and left 
        // node of the segment tree 
        segment[i].addAll(segment[2 * i]); 
        segment[i].addAll(segment[2 * i + 1]); 
    } 
  
    // Query in an range a to b 
    static HashSet<Integer> query(int node, int l,  
                                int r, int a, int b) 
    { 
        HashSet<Integer> left = new HashSet<>(); 
        HashSet<Integer> right = new HashSet<>(); 
        HashSet<Integer> result = new HashSet<>(); 
  
        // If the range is out of the bounds 
        // of this segment 
        if (b < l || a > r) 
            return result; 
  
        // If the range lies in this segment 
        if (a <= l && r <= b) 
            return segment[node]; 
  
        // Else query for the right and left 
        // leaf node of this subtree 
        // and insert them into the set 
        left = query(2 * node, l, (l + r) / 2, a, b); 
        result.addAll(left); 
  
        right = query(1 + 2 * node, 1 + (l + r) / 2, r, a, b); 
        result.addAll(right); 
  
        // Return the result 
        return result; 
    } 
  
    // Initialize the segment tree 
    @SuppressWarnings("unchecked") 
    static void init(int n)  
    { 
  
        // Get the height of the segment tree 
        int h = (int) Math.ceil(Math.log(n) / Math.log(2)); 
        h = (int) (2 * Math.pow(2, h)) - 1; 
  
        // Initialize the segment tree 
        segment = new HashSet[h]; 
        for (int i = 0; i < h; i++) 
            segment[i] = new HashSet<>(); 
    } 
  
    // Function to get the result for the 
    // subarray from arr[l] to arr[r] 
    static int getDistinct(int l, int r, int n) 
    { 
  
        // Query for the range set 
        HashSet<Integer> ans = query(1, 0, n - 1, l, r); 
  
        return ans.size();
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        Scanner s=new Scanner(System.in);
        
        StringBuilder sb=new StringBuilder();
        
        int n=s.nextInt();
        int q=s.nextInt();
        
        int[] arr=new int[n];
        
        for(int i=0;i<n;i++)
        {
        	arr[i]=s.nextInt();
        }
        
        init(n+5); 
        
        // Bulid the segment tree 
        build(1, 0, n - 1, arr); 
        
        for(int i=0;i<q;i++)
        {
        	int l=s.nextInt()-1;
        	int r=s.nextInt()-1;
        	
        	sb.append(getDistinct(l,r,n));
        	sb.append("\n");
        }
        
        System.out.println(sb);
        
    } 
} 