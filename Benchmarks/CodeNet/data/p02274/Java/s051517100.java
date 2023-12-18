import java.util.Scanner;
//import java.util.Arrays ;

// import java.InputMismatchException;
// alds_5b, Aizu Online Judge accept only class name: Main


class Main {

    static void print_list(int [] A, int low, int high) {
        int i ;
        for (i=low; i<high; i++) {
            System.out.printf("%d ", A[i]) ;
        }
        System.out.println() ;
    }

    static long Merge(int [] A, int low, int mid, int high) {
        long swap_count = 0 ;
        int l_size = mid-low ;
        int h_size = high-mid ;
        int []L = new int[l_size] ;
        int []H = new int[h_size] ;

        for (int i=0; i<l_size; i++) {
            L[i] = A[low+i] ;
        }
        for (int i=0; i<h_size; i++) {
            H[i] = A[mid+i] ;
        }

        int a_pos=low, l_pos=0, h_pos=0 ;

        while (l_size != 0 && h_size != 0) {
            //if (L[l_pos] <= H[h_pos]) {
            if (L[l_pos] < H[h_pos]) {  // should be <= ?
                A[a_pos] = L[l_pos] ;
                l_size -= 1 ;
                l_pos += 1 ;
            }
            else {
                A[a_pos] = H[h_pos] ;
                h_size -= 1 ;
                h_pos += 1 ;
                swap_count += l_size ;
            }
            a_pos += 1 ;
        }
        
        while (l_size != 0) {
            A[a_pos] = L[l_pos] ;
            l_size -= 1 ;
            l_pos += 1 ;
            a_pos += 1 ;
        }
        
        while (h_size != 0) {
            A[a_pos] = H[h_pos] ;
            h_size -= 1 ;
            h_pos += 1 ;
            a_pos += 1 ;
        }
        
        return swap_count ;

    }

    static long Merge_sort(int [] A, int low, int high) {
        if (low + 1 < high) {
            int mid = (low + high) / 2 ;
            long v1 = Merge_sort(A, low, mid) ;
            long v2 = Merge_sort(A, mid, high) ;
            long v3 = Merge(A, low, mid, high) ;
            return v1+v2+v3 ;
        }
        else return 0 ;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in) ;
        String s = scanner.nextLine() ;

        int elem_count ;
        elem_count = Integer.parseInt(s) ;
        int A[] = new int[elem_count] ;

        for (int i=0; i<elem_count; i++) {
            A[i] = scanner.nextInt() ;
        }

        scanner.close() ;
        long swap_count = Merge_sort(A, 0, elem_count) ;

        /*
        for (int i=0; i<elem_count; i++) {
            String end_mark = " " ;
            if (i==elem_count-1) end_mark = "\n" ;
            System.out.print(A[i] + end_mark) ;
        }

