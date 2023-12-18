public static void swap(int[] arr, int l, int r) {
        int tmp = arr[l];
        arr[l] = arr[r];
        arr[r] = tmp;
    }
public static void quickSort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }
    public static void sort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivot = partition(arr, left, right, arr[right]);
        sort(arr, left, pivot - 1);
        sort(arr, pivot + 1, right);
    }
    public static int partition(int[] arr, int left, int right, int pivot) {
        int l = left;
        int r = right;
        while (l < r) {
            while (l < r && arr[l] < pivot) {
                l++;
            }
            while (l < r && arr[r] >= pivot) {
                r--;
            }
            swap(arr, l, r);
        }
        swap(arr, l, right);
        return l;
    }